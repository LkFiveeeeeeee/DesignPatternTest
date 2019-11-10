package MyFarm.iterator;

public class IteratorPatternDemo {
    //3��ʹ��NameRepository��ȡ�����������ز�ѯ������Ϣ


    public static void PrintProducts() {

        NameRepository namesRepository = new NameRepository();
        System.out.println("Result List");
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String product_name = (String) iter.next();
            if (product_name != null) {
                System.out.println("Name : " + product_name);
            }

        }
    }
}