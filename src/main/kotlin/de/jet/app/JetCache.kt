package de.jet.app

import de.jet.library.runtime.sandbox.SandBox
import de.jet.library.structure.app.App
import de.jet.library.structure.app.AppCache
import de.jet.library.structure.app.cache.CacheDepthLevel
import java.util.*

object JetCache : AppCache {

	val registeredApplications = mutableSetOf<App>()

	val registeredSandBoxes = mutableMapOf<String, SandBox>()

	override fun dropEntityData(entityIdentity: UUID, dropDepth: CacheDepthLevel) {
		TODO("Not yet implemented")
	}

	override fun dropEverything(dropDepth: CacheDepthLevel) {
		TODO("Not yet implemented")
	}
}