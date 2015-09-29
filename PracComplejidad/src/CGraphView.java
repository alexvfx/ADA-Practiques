import javax.swing.*;

import java.awt.*;
import java.util.*;

public class CGraphView extends JFrame {
	private static final long serialVersionUID = 1L;
    private static final int HEIGHT = 400;
    private static final int WIDTH = 700;
    private ArrayList<Object> m_Elements;
    public CGraphView() {
    	m_Elements=new ArrayList<Object>();
    	setTitle("Práctica Complejidad");
        setSize(HEIGHT, WIDTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
    	super.paint(g);
    	Insets inset=getInsets();
    	CPoint mins=new CPoint(1e99,1e99);
    	CPoint maxs=new CPoint(-1e99,-1e99);
    	for (int i=0;i<m_Elements.size();++i) {
    		if (m_Elements.get(i) instanceof CGraph) {
    			CGraph gr=(CGraph) m_Elements.get(i);
    			gr.AddRectHull(mins, maxs);
    		}
    	}
    	Dimension dim=getSize();
    	double escX=(dim.getWidth()-inset.left-inset.right-100)/(maxs.m_X-mins.m_X);
    	double escY=(dim.getHeight()-inset.top-inset.bottom-100)/(maxs.m_Y-mins.m_Y);
    	double esc=escX;
    	if (escY<escX) esc=escY;
    	g.translate(inset.left-(int) (mins.m_X*esc)+40,inset.top- (int) (mins.m_Y*esc)+40);
    	for (int i=0;i<m_Elements.size();++i) {
    		if (m_Elements.get(i) instanceof CGraph) {
    			CGraph gr=(CGraph) m_Elements.get(i);
    			gr.Draw(g, esc);
    		}
    	}
    }
    public void ShowGraph(CGraph graph) {
    	m_Elements.add(graph);
    	repaint();
    }
    public void Clear() {
    	m_Elements.clear();
    	repaint();
    }
}
