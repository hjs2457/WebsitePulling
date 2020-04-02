import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class Pull {
	public static void main(String args[]) throws IOException{
        URL url = new URL("https://learnxinyminutes.com/docs/html/");
        URLConnection con = url.openConnection();
        InputStream is =con.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = null;
        ArrayList<String> stuff = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            stuff.add(line);
        }
        for(String s : stuff) {
        	System.out.println(s);
        }
	}
}
