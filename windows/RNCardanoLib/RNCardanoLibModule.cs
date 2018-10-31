using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Cardano.Lib.RNCardanoLib
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNCardanoLibModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNCardanoLibModule"/>.
        /// </summary>
        internal RNCardanoLibModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNCardanoLib";
            }
        }
    }
}
