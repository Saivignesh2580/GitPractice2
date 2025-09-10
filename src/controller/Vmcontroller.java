@Controller
public class Vmcontroller{
    
    @GetMapping("/getvas")
    public ResponseEntity<List<virtualAccpunt>> getVas(@AuthenticationPrincipal User user){
        
    }
}