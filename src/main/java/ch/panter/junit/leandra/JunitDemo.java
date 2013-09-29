package ch.panter.junit.leandra;

import java.lang.NullPointerException;

public class JunitDemo implements IJunitDemo {

	@Override
	public boolean isEmpty(String s) {
		try {
			if(s.isEmpty()){
				return true;
			}
		}
		catch(NullPointerException e){
			return true;
		}
		return false;
	}

	@Override
	public String capitalize(String s) {
		s = s.toLowerCase();
		String first = s.substring(0, 1).toUpperCase();
		s = first+s.substring(1);
		return s;
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		String rev = "";
		for(int i=s.length(); i>0; i--){
			rev += s.substring(i-1, i);
		}
		return rev;
	}

	@Override
	public String join(String... strings) {
		String joined = "";
		for(String s : strings){
			joined += s+" ";
		}
		return joined.substring(0, joined.length()-1);
	}

}
