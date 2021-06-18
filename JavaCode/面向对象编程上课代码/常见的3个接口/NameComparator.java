package 常见的3个接口;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: GaoBo
 * Date: 2021-01-17
 * Time: 11:59
 */
public class NameComparator implements Comparator<Student2> {

    @Override
    public int compare(Student2 o1, Student2 o2) {

        return o1.name.compareTo(o2.name);
    }
}
