@Service
@RequiredArgsConstructor
public class IncidentServiceImpl implements IncidentService {

    private final IncidentRepository repository;
    private final IncidentMapper mapper;

    @Override
    public Incident create(IncidentRequestDto dto) {
        return repository.save(mapper.toEntity(dto));
    }

    @Override
    public List<Incident> findAll() {
        return repository.findAll();
    }

    @Override
    public Incident updateStatus(Long id, IncidentStatus status) {
        Incident incident = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Incident not found"));
        incident.setStatus(status);
        return repository.save(incident);
    }
}
