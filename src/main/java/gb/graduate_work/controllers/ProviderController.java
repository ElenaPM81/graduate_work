package gb.graduate_work.controllers;

import gb.graduate_work.aspects.TrackUserAction;
import gb.graduate_work.domen.Provider;
import gb.graduate_work.service.ProviderService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.List;
// класс который обрабатывает запросы
@Controller
@AllArgsConstructor
@RequestMapping("/")
public class ProviderController {
    private final ProviderService providerService;

    //
    @GetMapping()
    public String showAllProviders(Model model) {
        List<Provider> providers = providerService.findAllProviders();
        model.addAttribute("providers", providers);
        return "providers";
    }
    // метод, отображающий список провайдеров

        @GetMapping("/new_provider")
        public String showNewProviderForm(Model model) {
            model.addAttribute("provider", new Provider());
            return "new_provider";
        } // метод, отображающий форму для создания нового провайдера
        @PostMapping("/new_provider")
        public String create(@ModelAttribute("provider") @Valid Provider provider,
                             BindingResult bindingResult) {
            if (bindingResult.hasErrors()) {
                return "new_provider";
            } // метод, создающий новый провайдер

            providerService.addProvider(provider);
            return "redirect:/";
        }

        @GetMapping("/update_provider/{id}")
        public String updateProviderForm(@PathVariable("id") int id, Model model) {
            Provider provider = providerService.getOne(id);
            model.addAttribute("provider", provider);
            return "update_provider";
        } // метод, отображающий форму для обновления провайдера

        @PostMapping("/update_provider")
        public String updateProvider(@Valid Provider provider, BindingResult bindingResult) {
            if (bindingResult.hasErrors()) {
                return "update_provider";
            }
            providerService.updateProvider(provider);
            return "redirect:/";
        }  // метод, обновляющий провайдера

        @GetMapping("/delete/{id}")
        public String deleteProvider(@PathVariable("id") int id) {
            providerService.deleteProviderById(id);
            return "redirect:/";
        }  // метод, удаляющий провайдера по идентификатору
    }


