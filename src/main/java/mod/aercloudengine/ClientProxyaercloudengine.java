package mod.aercloudengine;

public class ClientProxyaercloudengine extends CommonProxyaercloudengine {

	@Override
	public void registerRenderers(aercloudengine instance) {
		instance.elements.forEach(element -> element.registerRenderers());
	}
}
