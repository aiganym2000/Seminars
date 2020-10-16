package kz.kaznu.aiganym.task2;

public class Atelie {
    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes clothes1 : clothes) {
            if (clothes1 instanceof ManClothes) {
                System.out.println(clothes1.getName() + ": " + clothes1.getColor() + " " + clothes1.getCost() + " тг " + clothes1.getSize());
            }
        }
    }

    public void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes clothes1 : clothes) {
            if (clothes1 instanceof WomanClothes) {
                System.out.println(clothes1.getName() + ": " + clothes1.getColor() + " " + clothes1.getCost() + " тг " + clothes1.getSize());
            }
        }
    }
}
