package use_case.clear_users;
public class ClearInteractor {
    final ClearUserDataAccessInterface clearDataObject;

    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataObject, ClearOutputBoundary clearPresenter) {
        this.clearDataObject = clearDataObject;
        this.clearPresenter = clearPresenter;
    }


}
