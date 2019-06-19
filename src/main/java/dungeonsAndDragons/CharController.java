package dungeonsAndDragons;

import dungeonsAndDragons.PlayableCharacter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/home")
public class CharController {

    @RequestMapping("/characterDemo")
    public String getCharacter(@RequestParam(name = "name")String name, Model model){

        CharacterAttributes attributes = new CharacterAttributes();
        attributes.setCharisma(10);
        attributes.setConstitution(12);
        attributes.setDexterity(10);
        attributes.setIntelligence(12);
        attributes.setStrength(15);
        attributes.setWisdom(12);
        Fighter fighter = new Fighter();
        fighter.setCharacterAttributes(attributes);
        PlayableCharacter character = new PlayableCharacter();
        character.setCharacterClass(fighter);
        character.setName(name);
        character.setLevel(1);
        character.setHp(20);
        model.addAttribute("character",character);
        return "characterDemo";
    }
    @RequestMapping("/makeCharacters")
    public String makeCharacter(Model model){
        CharacterClass cc = new Fighter();
        PlayableCharacter pc = new PlayableCharacter();
        pc.setCharacterClass(cc);
        model.addAttribute("pc",pc);
        return "createPlayer";
    }
}
