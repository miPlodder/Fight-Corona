package covid19.example.covid19.adapter;

public interface CovidDetailsTableDataSource<TFirstHeaderDataType, TRowHeaderDataType, TColumnHeaderDataType, TItemDataType> {

    int getRowsCount();

    int getColumnsCount();

    TFirstHeaderDataType getFirstHeaderData();

    TRowHeaderDataType getRowHeaderData(int index);

    TColumnHeaderDataType getColumnHeaderData(int index);

    TItemDataType getItemData(int rowIndex, int columnIndex);

}