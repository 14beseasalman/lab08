package springlab;

import springlab.dao.CloDao;
import springlab.entity.Clo;

public class Client {

	public static void main(String[] args) {
		CloDao clodao = new CloDao();

		// Add new clo
		Clo clo = new Clo();
		clo.setName("CLO 1");
		clo.setDescription("Design efficient solutions for algorithmic problems");
		clo.setPlo("2");
		clodao.addClo(clo);

		clodao.updateClo(clo);

		// Delete an existing clo
		// dao.deleteClo(1);

		// Get all clos
		for (Clo iter : clodao.getAllClos()) {
			System.out.println(iter);
		}
		
		// Get clo by id
		System.out.println(clodao.getCloById(1));
		System.out.println("WOOT");
		

	}

}
