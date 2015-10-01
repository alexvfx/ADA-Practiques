import java.util.Comparator;

public class CVertexComparator implements Comparator<CVertex>{
	
	@Override
    public int compare(CVertex x, CVertex y)
    {
        if (x.m_Distance < y.m_Distance)
        {
            return -1;
        }
        if (x.m_Distance > y.m_Distance)
        {
            return 1;
        }
        return 0;
    }

}
