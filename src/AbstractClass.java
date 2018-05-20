/*Применение абстрактных классов
Для того, чтобы некоторые методы переопределялись в подклассе, достаточно
объявить их с модификатором типа abstract. Иногда они называются "методами
под ответственностью подкласса", поскольку в суперклассе для них никакой
реализации не предусмотренно. Следовательно, эти методы должны быть
переопределены в подклассе, где нельзя просто воспользоваться их вариантом,
определённым в суперклассе.

 */
// создаём суперкласс
abstract class AbstractClass {
    abstract void callme();

    // абстрактные классы могут также содержать конкретные методы
    void callmetoo() {
        System.out.println("Это конкретный метод.");
    }
}

// создаём подкласс
class PodclassAbs extends AbstractClass{
    void callme(){
        System.out.println("Это абстрактный метод callme() из класса " +
                "PodclassAbs");
    }
}

// создаём исполняемый класс
class AbstractDemo{
    public static void main(String[] args){
        PodclassAbs pca = new PodclassAbs();
        pca.callme();
        pca.callmetoo();
    }
}