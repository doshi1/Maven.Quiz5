package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup {
    List<String> stringlist;

    public SimpleStringGroup() {
        stringlist = new ArrayList<>();
    }
//    public SimpleStringGroup() {
//        throw new UnsupportedOperationException("Method not yet implemented");
//    }

    public Integer count() {
        return stringlist.size();
    }

    public void insert(String string) {  stringlist.add(string);
    }

    public Boolean has(String string) {
        return stringlist.contains(string);
    }

    public String fetch(int indexOfValue) {

        return stringlist.get(indexOfValue);
    }

    public void delete(String string) {
        stringlist.remove(string);

    }

    public void clear() {
        stringlist.clear();

    }

//    @Override
//    public Iterator iterator() {return stringlist.iterator();}
}
