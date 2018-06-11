package injectDAO;

public class InjectDaoServiceImpl implements InjectDao{
    InjectDao injectDAO;
    MyString string;

    public void setInjectDAO(InjectDao injectDAO) {
        this.injectDAO = injectDAO;
    }

    public void setString(MyString string) {
        this.string = string;
    }

    public InjectDaoServiceImpl(InjectDao injectD)
    {
        injectDAO=injectD;
    }
    public InjectDao getInjectDAO()
    {
        return injectDAO;
    }
    public MyString getString()
    {
        return string;
    }
    public InjectDaoServiceImpl(InjectDao injectD,MyString string)
    {
        injectDAO=injectD;
        this.string=string;
    }

}
