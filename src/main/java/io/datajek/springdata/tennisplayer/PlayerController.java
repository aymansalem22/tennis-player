package io.datajek.springdata.tennisplayer;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	@GetMapping("/players")
	public List<Player> getAllPlayer() {
		return Arrays.asList(new Player(1, "Ali", "Spanish", new Date(System.currentTimeMillis()), 10));
	}
}
