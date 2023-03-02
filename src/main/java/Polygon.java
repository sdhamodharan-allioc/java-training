public interface Polygon {
    public void getarea();
    default void getSizes()
    {
        System.out.println("sides of Polygon");
    }
}
