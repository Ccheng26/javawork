package student.ex.doa;

public class StudentBO {
	public void saveUser(Student student) {
		StudentDAO studentDAO= new StudentDAO();
		studentDAO.saveUser(student);
	}
}
