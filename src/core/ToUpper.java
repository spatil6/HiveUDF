package core;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class ToUpper extends UDF {

	public Text evaluate(Text s) {
		Text to_value = new Text("");
		if (s != null) {
		    try {
				to_value.set(s.toString().toUpperCase());
		    } catch (Exception e) { // Should never happen

				to_value = new Text(s);
		    }
		}
		return to_value;
    }
}
