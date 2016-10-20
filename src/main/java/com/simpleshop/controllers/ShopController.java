package com.simpleshop.controllers;

import com.simpleshop.entity.Inventory;
import com.simpleshop.form.OrderForm;
import com.simpleshop.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ShopController {

    @Autowired
    private InventoryService inventoryService;

    /**
     * Displays our main page.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("orderForm", new OrderForm());
        model.addAttribute("inventory", inventoryService.getInventoryList());
        return "home";
    }

    /**
     * Handles buy click
     * @param orderForm form representing our order
     */
    @RequestMapping(value = "/buy", method = RequestMethod.POST)
    public String buy(@ModelAttribute("orderForm") OrderForm orderForm, Model model) {
        try {
            List<Inventory> inventoryList = inventoryService.executeOrder(orderForm);
            model.addAttribute("inventory", inventoryList);
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            model.addAttribute("inventory", inventoryService.getInventoryList());
        }
        return "home";
    }

    /**
     * Resets the app
     * @param model
     * @return
     */
    @RequestMapping(value = "/reset", method = RequestMethod.GET)
    public String reset(Model model) {
        inventoryService.reset();
        model.addAttribute("orderForm", new OrderForm());
        model.addAttribute("inventory", inventoryService.getInventoryList());
        return "home";
    }

}

