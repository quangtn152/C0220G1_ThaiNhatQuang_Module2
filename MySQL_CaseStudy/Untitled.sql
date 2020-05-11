SELECT * FROM CaseStudy.NhanVien;
-- YeuCau2
select*from NhanVien
where HoTen like 'H%' or HoTen like 'T%'or HoTen like 'K%' 
and length(HoTen) <15;
select NgaySinh 
	(year(curdate())-year()) as age
from NhanVien;