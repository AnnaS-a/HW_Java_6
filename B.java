
//Задача: Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
//Реализовать в java. Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) 
//фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ; 2 - Объем ЖД; 3 - Операционная система; 4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - 
//сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

public class B {
    public String model;
    public String brend;
    public int operationalMemory;
    public int volumeSSD;
    public String operatingSystem;
    public double screenDiagonal;
    public String color;

    public B (String model, String brend, int operationalMemory, int volumeSSD, String operatingSystem, double screenDiagonal, String color){
        this.model = model;
        this.brend = brend;
        this.operationalMemory = operationalMemory;
        this.volumeSSD = volumeSSD;
        this.operatingSystem = operatingSystem;
        this.screenDiagonal = screenDiagonal;
        this.color = color;
    }    

    @Override
    public String toString() {
        return String.format("Модель %s: , Бренд %s, Оперативная память %d Гб , Объем SSD %d Гб, Операционная система %s, Диагональ %s, Цвет %s", this.model, this.brend, this.operationalMemory, this.volumeSSD, this.operatingSystem, this.screenDiagonal, this.color);
    }    

}
