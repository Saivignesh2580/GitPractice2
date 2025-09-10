@Controller
public class Vmcontroller{
    
    @GetMapping("/getvas")
    public ResponseEntity<List<VirtualAccount>> getVas(@AuthenticationPrincipal User user){

    }
}