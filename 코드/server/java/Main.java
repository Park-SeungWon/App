
import DataBase.Table.*;

public class Main {
	public static void main(String[] args) {
		Tblvoca _tblvoca = new Tblvoca();
 		_tblvoca.setMean("사과");
		SqlTblvoca sqlTblvoca = new SqlTblvoca();
		if (sqlTblvoca.insert_user(_tblvoca)) {
			System.out.println("insert complete");

		}
		else
		{
			System.out.println("insert fail");

		}
	}
}
