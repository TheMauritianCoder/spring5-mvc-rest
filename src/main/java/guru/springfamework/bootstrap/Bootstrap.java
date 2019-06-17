package guru.springfamework.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springfamework.domain.Category;
import guru.springfamework.repositories.CategoryRepository;

@Component
public class Bootstrap implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	public Bootstrap(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Category fruit = new Category();
		fruit.setName("fruits");

		Category dried = new Category();
		dried.setName("dried");

		Category fresh = new Category();
		fresh.setName("fresh");

		Category exotic = new Category();
		exotic.setName("exotic");

		Category nuts = new Category();
		nuts.setName("nuts");

		categoryRepository.save(fruit);
		categoryRepository.save(dried);
		categoryRepository.save(fresh);
		categoryRepository.save(exotic);
		categoryRepository.save(nuts);

		System.out.println("Data loaded =" + categoryRepository.count());

	}

}
