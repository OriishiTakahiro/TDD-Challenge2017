
import java.util.*;
import java.util.regex.*;

public class AddressChecker {
	
	
	private Set<String> getSetFromString(String charset) {
		Set<String> set = new HashSet<String>();
		String[] tmp_arr = new String[charset.length()];
		for(int i = 0; i < tmp_arr.length; i++){
			tmp_arr[i] = String.valueOf(charset.charAt(i));
		}
		Collections.addAll(set,tmp_arr);
		return set;
	}
	
	public boolean isDomainD1Valiable(String domain){

		Set<String> mail_set = getSetFromString("!#$%&'*+-/=?^_`{|}~.abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
		Set<String> domain_set = getSetFromString(domain);
		
		boolean is_valiable = mail_set.containsAll(domain_set);
		
		return is_valiable;
	}
	
	public boolean isDomainD2Valiable(String domain) {
		return domain.charAt(0) != '.';
	}
	
	public boolean isDomainD3Valiable(String domain) {
		return domain.charAt(domain.length()-1) != '.';
	}
	
	public boolean isDomainD4Valiable(String domain) {
		Pattern invalid_pattern = Pattern.compile(".\\.\\..*");
		return !(invalid_pattern.matcher(domain).find());
	}
	
	public boolean isDomainD5Valiable(String domain) {
		return !(domain.isEmpty());
	}
	
	public boolean isDomainA1Valiable(String address) {
		Pattern invalid_pattern = Pattern.compile("[^\"]*@[^\"]*@[^\"]*$");
		return !(invalid_pattern.matcher(address).find());
	}
	
	public String getLocal(String address){
		int index= 0;
		for(int i = 0; i < address.length(); i++){
			if(address.charAt(i) == '@'){
				index = i;
			}
		}
		
		String local_str = address.substring(0,index);
		
		return local_str;
	}
	
	public String getDomain(String address){
		int index= 0;
		for(int i = 0; i < address.length(); i++){
			if(address.charAt(i) == '@'){
				index = i;
			}
		}
		String domain = address.substring(index + 1,address.length());//indexは@の位置なので1を足します。		
		return domain;
		
	}
	
	public boolean isDotatomLD1Valiable(String local){
		Set<String> mail_set = getSetFromString("!#$%&'*+-/=?^_`{|}~.abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
		Set<String> local_set = getSetFromString(local);
		boolean is_valiable = mail_set.containsAll(local_set);
		return is_valiable;
	}

	public boolean isDotatomLD2Valiable(String dotatom){
		return dotatom.charAt(0) != '.';
	}
	
	public boolean isDotatomLD3Valiable(String dotatom){
		return dotatom.charAt(dotatom.length()-1) != '.';
	}
	
	public boolean isDotatomLD4Valiable(String dotatom){
		Pattern invalid_pattern = Pattern.compile(".\\.\\..*");
		return !(invalid_pattern.matcher(dotatom).find());
	}
	
	public boolean isDotatomLD5Valiable(String dotatom) {
		return !(dotatom.isEmpty());
	}
	
	public boolean isQuotedStrLQ1Valiable(String quotedStr) {
		return (quotedStr.charAt(0) == '\"');
	}
	
	public boolean isQuotedStrLQ2Valiable(String quotedStr) {
		return quotedStr.charAt(quotedStr.length()-1) == '\"';
	}
	
//	public boolean isQuotedStrLQ3Valiable(String quotedStr) {
//		String substr = quotedStr.substring(1, quotedStr.length()-1);
//		Set<String> quotedStr_set = getSetFromString("!#$%&'*+-/=?^_`{|}~.(),;:<>@[]\"\\abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
////		Set<String> local_set = getSetFromString(local);
//		boolean is_valiable = true;
//		return is_valiable;
//	}

}
