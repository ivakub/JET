package de.jet.library.structure.app

import de.jet.library.structure.app.cache.CacheDepthLevel
import java.util.*

interface AppCache {

	fun dropEntityData(entityIdentity: UUID, dropDepth: CacheDepthLevel)

	fun dropEverything(dropDepth: CacheDepthLevel)

}