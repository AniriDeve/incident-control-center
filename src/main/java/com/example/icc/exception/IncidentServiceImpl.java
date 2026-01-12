import com.example.icc.exception.IncidentNotFoundException;

@Override
public Incident updateStatus(Long id, IncidentStatus status) {
    Incident incident = repository.findById(id)
            .orElseThrow(() -> new IncidentNotFoundException(id));

    incident.setStatus(status);
    return repository.save(incident);
}
