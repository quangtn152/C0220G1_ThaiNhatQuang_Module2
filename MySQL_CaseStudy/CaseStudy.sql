create database CaseStudy;
create table LoaiKhach(
	idLoaiKhach int not null primary key,
    tenLoaiKhach varchar(45)
);
create table KhachHang(
	idKhachHang int not null primary key,
    idLoaiKhach int,
    FOREIGN KEY (idLoaiKhach) REFERENCES LoaiKhach(idLoaiKhach),
    HoTen varchar(45),
    NgaySinh Date,
    SDT varchar(45) UNIQUE,
    Email varchar(45) UNIQUE,
    DiaChi varchar(45)
);
create table NhanVien(
	idNhanVien int not null primary key,
    HoTen varchar(45),
    idViTri int,
    FOREIGN KEY (idViTri) REFERENCES ViTri(idViTri),
    idTrinhDo int,
    FOREIGN KEY (idTrinhDo) REFERENCES TrinhDo(idTrinhDo),
    idBoPhan int,
    FOREIGN KEY (idBoPhan) REFERENCES BoPhan(idBoPhan),
    NgaySinh Date,
    SoCMND varchar(45) UNIQUE,
    Luong varchar(45),
    SDT varchar(45) UNIQUE,
    Email varchar(45) UNIQUE,
    DiaChi varchar(45)
);
create table ViTri(
	idViTri int not null primary key,
    TenViTri varchar(45)
);
create table TrinhDo(
	idTrinhDo int not null primary key,
    TrinhDo varchar(45)
);
create table BoPhan(
	idBoPhan int not null primary key,
    BoPhan varchar(45)
);
create table DichVuDiKem (
	idDichVuDiKem int not null primary key,
    TenDichVuDiKem varchar(45),
    Gia int,
    Donvi int,
    TrangThaiKhaDung varchar(45)
);
create table HopDongChiTiet (
	idHopDongChiTiet int not null primary key,
    idHopDong int,
    idDichVuDiKem int,
	FOREIGN KEY (idDichVuDiKem) REFERENCES DichVuDiKem(idDichVuDiKem),
    SoLuong int
);
create table KieuThue(
	idKieuThue int not null primary key,
	TenKieuThue varchar(45),
	Gia int
);
create table LoaiDichVu(
	idLoaiDichVu int not null primary key,
	TenLoaiDichVu varchar(45)
);
create table DichVu(
	idDichVu int not null primary key,
	TenDichVu varchar(45),
    DienTich int,
    SoTang int,
    SoNguoiToiDa int,
    ChiPhiThue int,
    idKieuThue int,
    foreign key(idKieuThue) references KieuThue(idKieuThue),
    idLoaiDichVu int,
	foreign key(idLoaiDichVu) references LoaiDichVu(idLoaiDichVu),
    TrangThai varchar(45)
);
create table HopDong(
	idHopDong int not null primary key,
    idNhanVien int,
	foreign key(idNhanVien) references NhanVien(idNhanVien),
	idKhachHang int,
	foreign key(idKhachHang) references KhachHang(idKhachHang),
	idDichVu int,
	foreign key(idDichVu) references DichVu(idDichVu),
    NgayLamHopDong date,
    TienDatCoc int,
    TongTien int
)
SELECT * FROM CaseStudy.NhanVien;

-- YeuCau2
select*from NhanVien
where HoTen like 'H%' or HoTen like 'T%'or HoTen like 'K%' 
and length(HoTen) <15;
select NgaySinh 
	(year(curdate())-year()) as age
from NhanVien;

-- YeuCau3
select 
 HoTen,
 NgaySinh,
 DiaChi
--  (year(curdate())- year(NgaySinh))- (RIGHT(CURDATE(),5) < RIGHT(NgaySinh,5)) as Tuoi
from KhachHang
where ((year(curdate())- year(NgaySinh))- (RIGHT(CURDATE(),5) < RIGHT(NgaySinh,5)) between 18 and 50) and (DiaChi='DN' or DiaChi='QB');

-- YeuCau 4
 
SELECT HopDong.idKhachHang, KhachHang.Hoten, LoaiKhach.tenLoaiKhach, COUNT(HopDong.idKhachHang) 
FROM HopDong
INNER JOIN KhachHang ON HopDong.idKhachHang = KhachHang.idKhachHang
INNER JOIN LoaiKhach ON KhachHang.idLoaiKhach = LoaiKhach.idLoaiKhach
GROUP BY idKhachHang 
having LoaiKhach.tenLoaiKhach='Diamond'
-- having LoaiKhach.idLoaiKhach=103
order by COUNT(idKhachHang) asc ;

-- YeuCau 5
-- Tong = ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem)
select KhachHang.idKhachHang, KhachHang.HoTen,LoaiKhach.tenLoaiKhach,HopDong.idHopDong,HopDong.NgayLamHopDong,HopDong.NgayKetThuc,
DichVu.TenDichVu, sum(DichVu.ChiPhiThue+HopDongChiTiet.SoLuong*DichVuDiKem.Gia) as TongTien
from KhachHang
left join LoaiKhach on KhachHang.idLoaiKhach =LoaiKhach.idLoaiKhach
left join HopDong on KhachHang.idKhachHang = HopDong.idKhachHang
left join DichVu on HopDong.idDichVu = DichVu.idDichVu
left join HopDongChiTiet on HopDong.idHopDong = HopDongChiTiet.idHopDong
left join DichVuDiKem on HopDongChiTiet.idDichVuDiKem = DichVuDiKem.idDichVuDiKem
-- group by KhachHang.idKhachHang; 
group by KhachHang.idKhachHang, KhachHang.HoTen,LoaiKhach.tenLoaiKhach,HopDong.idHopDong,HopDong.NgayLamHopDong,HopDong.NgayKetThuc,
DichVu.TenDichVu;
-- Yeu Cau 6
select DichVu.idDichVu, DichVu.TenDichVu, DichVu.DienTich, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu
from DichVu
inner join LoaiDichVu on DichVu.idLoaiDichVu = LoaiDichVu.idLoaiDichVu
where not exists( select HopDong.idHopDong 
from HopDong 
where ( HopDong.NgayLamHopDong between '2019-01-01' and '2019-03-31') and HopDong.idDichVu = DichVu.idDichVu);

-- Yeu Cau 7 
select DichVu.idDichVu, DichVu.TenDichVu, DichVu.DienTich, DichVu.SoNguoiToiDa, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu
from DichVu
inner join LoaiDichVu on DichVu.idLoaiDichVu = LoaiDichVu.idLoaiDichVu
where exists (select HopDong.idHopDong
from HopDong
where( HopDong.NgayLamHopDong between '2017-12-31' and '2018-12-31') and HopDong.idDichVu = DichVu.idDichVu)
and not exists (select HopDong.idHopDong
from HopDong
where( HopDong.NgayLamHopDong between '2018-12-31' and '2019-12-31') and HopDong.idDichVu = DichVu.idDichVu);
-- yeu cau 8
-- Cach 1
select distinct KhachHang.HoTen 
from KhachHang;
-- Cach 2
select KhachHang.HoTen 
from KhachHang
group by KhachHang.HoTen;
-- Cach 3
select KhachHang.HoTen 
from KhachHang 
union select KhachHang.HoTen 
from KhachHang;


-- Tinh Tong tien
-- sum(DichVu.ChiPhiThue+HopDongChiTiet.SoLuong*DichVuDiKem.Gia)
update HopDong 
set TongTien = (
select x.tong from(select sum(DichVu.ChiPhiThue+HopDongChiTiet.SoLuong*DichVuDiKem.Gia) as Tong
from 
DichVu
left join HopDong on DichVu.idDichVu= HopDong.idDichVu
left join HopDongChiTiet on HopDong.idHopDong = HopDongChiTiet.idHopDong
left join DichVuDiKem on HopDongChiTiet.idDichVuDiKem = DichVuDiKem.idDichVuDiKem
group by HopDong.idHopDong) as x
);
-- left join DichVu on HopDong.idDichVu = DichVu.idDichVu
-- left join HopDongChiTiet on HopDong.idHopDong = HopDongChiTiet.idHopDong
-- left join DichVuDiKem on HopDongChiTiet.idDichVuDiKem = DichVuDiKem.idDichVuDiKem

-- Yeu Cau 9
select temp.month, month(HopDong.NgayLamHopDong) as month2019,COUNT(HopDong.NgayLamHopDong) as sokhach, HopDong.TongTien 
from (select 1 as month
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as temp
-- from HopDong
left join HopDong on month(HopDong.NgayLamHopDong) = temp.month
left join KhachHang on KhachHang.idKhachHang = HopDong.idKhachHang 
where year(HopDong.NgayLamHopDong) ='2019' or year(HopDong.NgayLamHopDong) is null or month(HopDong.NgayLamHopDong) is null
GROUP BY temp.month, HopDong.NgayLamHopDong ,HopDong.NgayLamHopDong,HopDong.TongTien;
-- order by month(HopDong.NgayLamHopDong);

-- Yeu Cau 10
-- SoLuongDichVuDiKem (được tính dựa trên việc count các IDHopDongChiTiet)
select HopDong.idHopDong, HopDong.NgayLamHopDong, HopDong.NgayKetThuc, HopDong.TienDatCoc,HopDongChiTiet.idDichVuDiKem, count(HopDongChiTiet.idDichVuDiKem) as So_luong_dich_vu
from HopDongChiTiet
inner join HopDong on HopDong.idHopDong = HopDongChiTiet.idDichVuDiKem
group by HopDongChiTiet.idDichVuDiKem;

-- Yeu Cau 11
select distinct KhachHang.HoTen, LoaiKhach.tenLoaiKhach, DichVuDiKem.TenDichVuDiKem
from HopDong
inner join HopDongChiTiet on HopDong.idHopDong = HopDongChiTiet.idHopDong
inner join DichVuDiKem on HopDongChiTiet.idDichVuDiKem = DichVuDiKem.idDichVuDiKem
inner join KhachHang on KhachHang.idKhachHang = HopDong.idKhachHang
inner join LoaiKhach on KhachHang.idLoaiKhach = LoaiKhach.idLoaiKhach
where LoaiKhach.tenLoaiKhach= 'Diamond' and KhachHang.DiaChi in('DN','QB');

-- Yeu Cau 12
-- Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, 
-- SoLuongDichVuDikem (được tính dựa trên tổng Hợp đồng chi tiết), TienDatCoc của tất cả các dịch vụ 
-- đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 nhưng chưa từng được khách hàng đặt 
-- vào 6 tháng đầu năm 2019.
select HopDong.idHopDong, NhanVien.HoTen as HoTenNhanVien, KhachHang.HoTen as HoTenKhach, KhachHang.SDT, DichVu.TenDichVu, HopDong.TienDatCoc
, count(HopDongChiTiet.idDichVuDiKem) as SoLuongDichVuDikem
from HopDong
inner join NhanVien on HopDong.idNhanVien = NhanVien.idNhanVien
inner join KhachHang on HopDong.idKhachHang = KhachHang.idKhachHang
inner join DichVu on HopDong.idDichVu = DichVu.idDichVu
inner join HopDongChiTiet on HopDong.idHopDong = HopDongChiTiet.idHopDong
inner join DichVuDiKem on HopDongChiTiet.idDichVuDiKem = DichVuDiKem.idDichVuDiKem
where exists (select HopDong.idHopDong
from HopDong
where( HopDong.NgayLamHopDong between '2019-10-31' and '2019-12-31'))
and not exists (select HopDong.idHopDong
from HopDong
where( HopDong.NgayLamHopDong between '2019-01-01' and '2019-06-01'))
group by HopDong.idHopDong, NhanVien.HoTen, KhachHang.HoTen , KhachHang.SDT, DichVu.TenDichVu, HopDong.TienDatCoc;

-- Yeu Cau 13
-- tao bang tam 
create temporary table temp
select DichVuDiKem.TenDichVuDiKem as Ten_dich_vu_diKem, count( HopDongChiTiet.idDichVuDiKem) as So_lan_su_dung
from HopDongChiTiet
inner join DichVuDiKem on DichVuDiKem.idDichVuDiKem=HopDongChiTiet.idDichVuDiKem
group by DichVuDiKem.TenDichVuDiKem;
select * from temp;

create temporary table temp1
select max(temp.So_lan_su_dung )as max
from temp;
select * from temp1;

select temp.Ten_dich_vu_diKem, temp.So_lan_su_dung 
from temp 
inner join temp1 on temp.So_lan_su_dung = temp1.max;

drop temporary table temp;
drop temporary table temp1;
-- Yeu Cau 14
select HopDong.idHopDong, LoaiDichVu.TenLoaiDichVu,DichVuDiKem.TenDichVuDiKem,
count(HopDongChiTiet.idDichVuDiKem) as so_lan_su_dung
from HopDong 
inner join LoaiDichVu on HopDong.idDichVu = LoaiDichVu.idLoaiDichVu
inner join HopDongChiTiet on HopDong.idHopDong = HopDongChiTiet.idHopDong
inner join DichVuDiKem on DichVuDiKem.idDichVuDiKem = HopDongChiTiet.idDichVuDiKem
group by DichVuDiKem.TenDichVuDiKem ,HopDong.idHopDong, LoaiDichVu.TenLoaiDichVu,DichVuDiKem.TenDichVuDiKem
having so_lan_su_dung = 1;

-- yeu cau 15
select NhanVien.idNhanVien, NhanVien.HoTen, NhanVien.SDT,NhanVien.DiaChi,TrinhDo.TrinhDo,BoPhan.BoPhan
,count(HopDong.idNhanVien) as so_lan_tao_HopDong
from NhanVien
inner join TrinhDo on TrinhDo.idTrinhDo = NhanVien.idTrinhDo
inner join BoPhan on BoPhan.idBoPhan = NhanVien.idBoPhan
inner join HopDong on HopDong.idNhanVien = NhanVien.idNhanVien
where HopDong.NgayLamHopDong between '2020-01-01' and '2020-12-31'
group by NhanVien.idNhanVien
having so_lan_tao_HopDong<4;
-- yeu cau 16
