//import java.util.Comparator;
import java.util.LinkedList;

public class CVertex implements Comparable<CVertex>{
	public CPoint m_Point;
	public LinkedList<CVertex> m_Neighbords;
	public double m_Distance;
	public boolean m_Visit;
	public CVertex(double x, double y) {
		m_Point=new CPoint(x,y);
		m_Neighbords=new LinkedList<CVertex>(); 
	}
	
	@Override
	public int compareTo(CVertex vertex) {

        if (this.m_Distance < vertex.m_Distance)
        {
            return -1;
        }
        if (this.m_Distance > vertex.m_Distance)
        {
            return 1;
        }
        return 0;
	}
	//@Override
    //**public int compare(CVertex x, CVertex y)
    //{
    //    if (x.m_Distance < y.m_Distance)
    //    {
    //        return -1;
    //    }
    //    if (x.m_Distance > y.m_Distance)
    //    {
    //        return 1;
    //    }
    //    return 0;
    //}
	
	
}

