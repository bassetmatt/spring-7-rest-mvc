package guru.springframework.spring7restmvc.controller;

import guru.springframework.spring7restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class BeerController {

    private final BeerService beerService;
}
