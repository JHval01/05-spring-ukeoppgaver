package service;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class TempService {

    public final Integer[] tempArray = new Integer[]{-3, -2, 2, 7, 12, 16, 18, 17, 12, 7, 3, -2};

    public int getTemp(String mnd){
        return switch(mnd.toLowerCase(Locale.ROOT)){
            case "januar" -> tempArray[0];
            case "februar" -> tempArray[1];
            case "mars" -> tempArray[2];
            case "april" -> tempArray[3];
            case "mai"-> tempArray[4];
            case "juni" -> tempArray[5];
            case "juli" -> tempArray[6];
            case "august" -> tempArray[7];
            case "september" -> tempArray[8];
            case "oktober" -> tempArray[9];
            case "november" -> tempArray[10];
            case "desember" -> tempArray[11];
            default -> 0;
        };
    }

}
