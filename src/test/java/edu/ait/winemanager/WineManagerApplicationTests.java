package edu.ait.winemanager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import edu.ait.winemanager.repositories.WineRepository;
import edu.ait.winemanager.dto.Wine;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Optional;
import java.util.List;

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

	@Test
	void deleteTest() {

		wineRepository.deleteById(13);
		Optional<Wine> wine = wineRepository.findById(13);
		assertFalse((wine.isPresent()), "Wine found");
	}

	@Test
	void sizeTest() {

		List<Wine> wines = wineRepository.findAll();
		assertTrue((wines.size() > 11), "Size less than 12");
	}
}
