import com.badlogic.gdx.math.Vector2;

public class ProjectileEquation {
    public float gravity;
    public Vector2 initialVelocity = new Vector2();
    public Vector2 initialPosition = new Vector2();

    public float getX(float time) {
        return initialPosition.x + initialVelocity.x * time;
    }

    public float getY(float time) {
        return initialPosition.y + initialVelocity.y * time + 0.5f * gravity * time * time;
    }
}
