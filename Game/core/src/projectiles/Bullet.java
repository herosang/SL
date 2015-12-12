package projectiles;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Touchable;

import java.awt.*;

/**
 * This class will be the superclass of the bullet class.
 * @author Hongyu Wang
 * @version 1.0
 * @since 2015/11/14
 */
public class Bullet extends Weapon {
    /**
     * The current location of the bullet.
     */
    protected int[] location;

    /**
     * Whether or not the bullet as been reflected or not
     */
    protected boolean bounced;
    /**
     * The current trajectory of the bullet. This is an angle in degrees.
     */




    /**
     * Gets the location as a <Point></Point>
     * @return Point
     */
    public int[] getLocation() {
        return location;
    }

    /**
     * Gets the trajectory of the bullet as a radian angle.
     * @return trajectory
     */
    public double getTrajectory() {
        return trajectory;
    }

    /**
     * Sets the trajectory of the bullet as a radian angle.
     * @param trajectory
     */
    public void setTrajectory(double trajectory) {
        this.trajectory = trajectory;
    }

    /**
     * Constructor for the bullet
     * @param x: initial x position of the bullet
     * @param y: initial y position of the bullet
     */


    public Bullet(int x, int y, double trajectory){
        super(x, y, trajectory);
        System.out.println(this.getX() + "," + this.getY());
        this.trajectory = trajectory;
        this.speed = 3;
        this.bounced = false;


        this.sprite = new Sprite(new Texture(("S2.png")));
        sprite.setOrigin(sprite.getWidth() / 2, sprite.getHeight() / 2);
        setBounds(sprite.getX(), sprite.getY(), sprite.getWidth(), sprite.getHeight()); //initilization stuff for the actor
        setTouchable(Touchable.enabled);

    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        sprite.draw(batch, parentAlpha);
    }

    @Override
    public void update() {
        //System.out.println(this.getX()+ "      " + this.getY());
        //this.x_velo =  Math.sin(Math.toRadians(trajectory)) * speed;
        //this.y_velo =  Math.cos(Math.toRadians(trajectory)) * speed;
        this.setX((float) (this.getX() ));
        this.setY((float) (this.getY() ));
        sprite.setPosition(this.getX(),this.getY());
        sprite.setRotation((float)this.getTrajectory());
    }

    public boolean isBounced() {
        return bounced;
    }

    public void setBounced(boolean bounced) {
        this.bounced = bounced;
    }
}
