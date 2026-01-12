@RestController
@RequestMapping("/api/v1/incidents")
@RequiredArgsConstructor
public class IncidentController {

    private final IncidentService service;

    @PostMapping
    public Incident create(@RequestBody IncidentRequestDto dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<Incident> getAll() {
        return service.findAll();
    }

    @PutMapping("/{id}/status")
    public Incident updateStatus(
            @PathVariable Long id,
            @RequestParam IncidentStatus status
    ) {
        return service.updateStatus(id, status);
    }
}
