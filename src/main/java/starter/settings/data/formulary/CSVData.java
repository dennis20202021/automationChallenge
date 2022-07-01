package starter.settings.data.formulary;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CSVData {

    public String getData(int column, int row, String fileName) {
        String data="";
        try {
            Reader reader = new FileReader(fileName);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withDelimiter(',')
                    .parse(reader);

            int rowData = 0;

            for (CSVRecord eachRecord : records) {
                data = eachRecord.get(column);
                rowData++;
                if (rowData == row) {
                    return data;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

}
