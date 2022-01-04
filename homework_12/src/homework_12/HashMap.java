package homework_12;

import java.util.Iterator;
import java.util.Map;

public class HashMap {
	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		Map<String, Book> books = (Map<String, Book>) new HashMap();
		books.put("1", new Book("1", "�����뺣", 36, "���������"));
		books.put("2", new Book("2", "����", 45, "���������"));
		books.put("4", new Book("4", "����������", 30, "���������"));
		books.put("3", new Book("3", "��¥��", 89, "���������"));
		@SuppressWarnings("rawtypes")
		Iterator iter = books.entrySet().iterator();
		while (iter.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println(((Book) entry.getValue()).toString());
		}
	}
}

