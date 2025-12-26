@Override
public SkillRequest updateRequest(Long id, SkillRequest request) {
    SkillRequest existing = getRequestById(id);
    existing.setSkill(request.getSkill());
    existing.setUser(request.getUser());
    existing.setDescription(request.getDescription());
    existing.setActive(request.getActive());
    return repository.save(existing);
}

@Override
public List<SkillRequest> getRequestsByUser(Long userId) {
    return repository.findByUserId(userId); // assumes repository method exists
}
