package kk_repo.designpattern.immutable;

final class StudentImmutable {

    private final FullName fullName;

    public StudentImmutable(FullName fullName) {
        this.fullName = new FullName(fullName.getFirstName(), fullName.getLastName());
    }

    public FullName getFullName() {
        return new FullName(fullName.getFirstName(), fullName.getLastName());
    }
}
