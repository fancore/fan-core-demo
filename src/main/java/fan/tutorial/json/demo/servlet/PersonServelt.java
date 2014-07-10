package fan.tutorial.json.demo.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fan.core.util.ConvertUtil;
import fan.core.util.FileUtil;
import fan.core.json.Json;
import fan.core.util.MethodUtil;
import fan.tutorial.json.demo.model.Person;

public class PersonServelt extends HttpServlet {

	private static final long serialVersionUID = 5586344927777757698L;
	private static final List<Person> persons = new ArrayList<Person>();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Json.getDefault().outputObject("persons", persons, response);
		return ;
	}

	@Override
	public void init() throws ServletException {
		super.init();
		String[] lines = FileUtil.readLineFile("src/main/test/resources/person.data");
		Class<?>[] types = {String.class, String.class, String.class, Date.class};
		for(String line : lines){
			String[] datas = line.split("	");
			Object[] values = ConvertUtil.objectValues(datas, types);
			persons.add(MethodUtil.invokeConstructor(Person.class, values, types));
		}
	}
	
}