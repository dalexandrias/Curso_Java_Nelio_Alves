package aplicacao;

import dominio.Pessoa;
import dominio.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {

	public static void main(String[] args) {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager entityManager = managerFactory.createEntityManager();

		Pessoa p = entityManager.find(Pessoa.class, 10);

		System.out.println(p);

		Produto produto = new Produto(null, "TV LG 4K", 4.678, p);

		entityManager.getTransaction().begin();
		entityManager.persist(produto);
		entityManager.getTransaction().commit();

		System.out.print("Finalizado");
		managerFactory.close();
		entityManager.close();
	}
}
