package StrgWar.gui;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

public class DrawingManager
{
	public DrawingManager(GraphicsContext gc, Pane root)
	{
		_root = root;
		_gc = gc;
		_drawable = new ArrayList<IDrawable>();
	}
	
	public void Register(IDrawable drawwable)
	{
		_drawable.add(drawwable);
	}
	
	public void draw()
	{
		_gc.clearRect(0, 0, 900, 600);
		
		for (IDrawable drawable : _drawable)
			drawable.Draw(_gc, _root);
	}
	
	private final Pane _root;
	private final GraphicsContext _gc;
	private final ArrayList<IDrawable> _drawable;
	
}
