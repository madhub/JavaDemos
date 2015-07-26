import javafx.collections.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bs_ma on 26-07-2015.
 */
public class JavaFXObservableCollectionDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        ObservableList<String> observableList = FXCollections.observableList(list);
        observableList.addListener((ListChangeListener) change -> {

            System.out.println("Detected a change! ");

            while (change.next()) {

                System.out.println("Was added? " + change.wasAdded());

                System.out.println("Was removed? " + change.wasRemoved());

            }

        });
        observableList.add("a : item one");
        System.out.println("Size: " + observableList.size() + observableList.toString());
        observableList.remove(1);
        System.out.println("Size: " + observableList.size() + observableList.toString());


    }

    public static void mapDemo() {
        Map<String,String> map = new HashMap<String,String>();
        ObservableMap<String,String> observableMap = FXCollections.observableMap(map);
        observableMap.addListener((MapChangeListener) change -> {
            System.out.println("Detected a change! ");
        });
        observableMap.put("key 1","value 1");
        System.out.println("Size: "+observableMap.size() + observableMap.toString());



    }
}
