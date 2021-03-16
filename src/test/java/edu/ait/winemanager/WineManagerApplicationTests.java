package edu.ait.winemanager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import edu.ait.winemanager.repositories.WineRepository;
import edu.ait.winemanager.dto.Wine;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class WineManagerApplicationTests {

	@Autowired
	WineRepository wineRepository;

	@Test
	void saveTest() {

		Wine wine = new Wine(13, "Château Beaulieu Comtes de Tastes",
				2018, "Merlot/Cabernet Franc/Cabernet Sauvignon",
				"France", "Bordeaux",
				"Lacks some acidity and intensity, but the flavour profile is balanced and enjoyable. Oaky, with cherry on the nose, red fruit and pomegranate on the palate.",
				"ChateauBeaulieu.jpg");

		wineRepository.save(wine);
		assertNotNull(wineRepository.findById(13), "Wine not found");

	}

}
