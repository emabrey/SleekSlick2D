package org.newdawn.slick.particles;

/**
 * A description of any class that can create Configurable Emitters during the ParticleIO load phase.
 * <p>
 * @author kevin
 */
public interface ConfigurableEmitterFactory {

	/**
	 * Create a configurable emitter that will be populated with loaded data
	 * <p>
	 * @param name The name given to the emitter
	 * <p>
	 * @return The newly created configurable emitter
	 */
	public ConfigurableEmitter createEmitter(String name);

}
