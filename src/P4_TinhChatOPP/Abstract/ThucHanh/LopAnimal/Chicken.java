package P4_TinhChatOPP.Abstract.ThucHanh.LopAnimal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: Cuc ta cuc Tac ";
    }

    @Override
    public String howToEat() {
        return "Fried chicken";
    }
}
