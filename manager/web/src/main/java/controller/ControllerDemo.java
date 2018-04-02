package controller;



@Controller
public class AdminLoginController {

    @Autowired
    private ItemParamItemService itemParamItemService;

    @RequestMapping("/showParam/{itemId}")
    public String showParam(@PathVariable Long itemId, Model model) {
        String string = itemParamItemService.getItemParemById(itemId);
        model.addAttribute("html", string);
        return "item-param";
    }

}