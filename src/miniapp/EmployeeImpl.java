package miniapp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EmployeeImpl implements Employee {

	@Override
	public void addEmployee(Emp e) throws UserException {
		
			try {
				FileOutputStream fos = new FileOutputStream("c:\\");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				throw new UserException("something went wrong.  try after some time ", e1);
			}
	}
}
