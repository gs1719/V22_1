# V22_1
list view with custom adapter class
### At first created a custom layout file which is used by every list [link](https://github.com/gs1719/V22_1/blob/master/app/src/main/res/layout/each_item_layout.xml) 

## created simple list view in main xml file
```.xml
    <ListView
        android:id="@+id/listView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_marginStart="1dp"
        android:layout_marginTop="10dp"
        android:layout_marginEnd="1dp"
        android:layout_marginBottom="1dp"
        tools:listitem="@layout/each_item_layout"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```
