public class CPoint {
	public double m_X,m_Y;
	public CPoint(double x,double y) {
		m_X=x;
		m_Y=y;
	}
	public CPoint Neg() {
		return new CPoint(-m_X,-m_Y);
	}
	public CPoint Add(CPoint b) {
		return new CPoint(m_X+b.m_X,m_Y+b.m_Y);
	}
	public CPoint Sub(CPoint b) {
		return new CPoint(m_X-b.m_X,m_Y-b.m_Y);
	}
	public double Product(CPoint b) {
		return m_X*b.m_X+m_Y*b.m_Y;
	}
	public CPoint Div(double b) {
		return new CPoint(m_X/b,m_Y/b);
	}
	public double Module() {
		return Math.sqrt(m_X*m_X+m_Y*m_Y);
	}
}
